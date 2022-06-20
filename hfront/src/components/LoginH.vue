<template>
<v-container fluid class="fill-height">
    <v-row>
        <v-col class="centralizar">
            <div class="envelope">
                <h1>Entrar: </h1>
                <p v-if="msg != ''" class="ml-5">{{ msg }}</p>
                <v-form 
                    ref="loginform"
                    v-model="valid"
                    lazy-validation
                    >
                    <v-container fluid>
                        <v-row>
                            <v-col>
                                <v-text-field
                                    v-model = "auth.identificador"
                                    :rules = "authR.identificador"
                                    label = "CPF/CNPJ(Apenas Numeros):"
                                    required
                                ></v-text-field>
                            </v-col>
                        </v-row>
                        <v-row>
                            <v-col>
                                <v-text-field
                                    v-model = "auth.pass"
                                    :rules = "authR.pass"
                                    label = "Senha:"
                                    type = "password"
                                    required
                                ></v-text-field>
                            </v-col>
                        </v-row>
                        <v-row>
                            <v-col>

                            </v-col>
                        </v-row>
                        <v-row>
                            <v-col>
                                <v-btn
                                    :disabled = "!valid"
                                    color="error"
                                    class="ml-auto"
                                    @click="entrar"
                                >Entrar</v-btn>
                            </v-col>
                        </v-row>
                    </v-container>
                </v-form>
            </div>
        </v-col>
    </v-row>
</v-container>
</template>
<script>
import { http } from "@/services/api-config";
export default
{
    name : 'LoginH',
    data : () =>({
        valid : true,
        msg : '',
        usuario : null,
        resposta: '',
        auth : {
            identificador : '',
            pass : '',
        },
        authR : {
            identificador : [
                v => !!v || 'CPF ou CNPJ são obrigatorios para continuar',
            ],
            pass : [
                v => !!v || 'Senha e necessaria para entrar',
            ]
        }
    }),
    methods: {
        entrar ()
        {
            if(this.$refs.loginform.validate())
            {
                http.post('/login/validar',{
                    'usuario' : this.auth.identificador,
                    'senha' : this.auth.pass,
                }).then((response)=>(this.resposta = response))
                if(this.resposta.status === 200)
                {
                    localStorage.setItem('usuario',JSON.stringify(this.resposta.data))
                    this.criarSessao()
                }
                else
                {
                    this.msg = "usuario não encontrado"
                }
            }
        },
        criarSessao()
        {
            if(localStorage.getItem('usuario') != null)
            { 
                this.$session.start();
                this.$session.set("usuario",JSON.parse(localStorage.getItem('usuario')))
                this.usuario = JSON.parse(localStorage.getItem('usuario'))
                localStorage.removeItem('usuario')
                if(this.usuario.identificador.length > 11)
                {
                    this.usuario = null
                    this.$router.push('/about')
                }
                else
                {
                    this.usuario = null
                    this.$router.push('/userv')
                }
            }
            else
            {

            }
        }
    },
}
</script>
<style scoped lang="scss">
.centralizar
{
    display: flex;
    justify-content: center;
    align-items: center;
}
.envelope
{
    width: fit-content;
    box-sizing: fit-content;
    background-color: rgba(#FFFFFF,0.8);
    align-items: center;
    border-radius: 0.4rem;
}
</style>

<template>
<v-container fluid class="fill-height">
    <v-row>
        <v-col cols="6" class="centralizar">
            <div class="envelope">
            <h2>
                A oportunidade está mais perto do que imagina
            </h2>
            </div>
        </v-col>
        <v-col cols="6" class="centralizar">
            <div class="envelope">
            <h3 class="mensagem mr-3 ml-2 mt-4">Comece um novo futuro se cadastrando abaixo</h3>
            <p v-if="msg != ''" class="ml-5">{{ msg }}</p>
            <h-form ref="form" v-model="valid" lazy-validation>
                <v-container>
                    <v-row>
                        <v-col>
                            <v-text-field
                                v-model = "nome"
                                :rules = "regrasNome"
                                label = "Nome Completo:"
                                required
                            ></v-text-field>
                        </v-col>
                    </v-row>
                    <v-row>
                        <v-col>
                            <v-text-field
                                v-model= "email"
                                :rules = "regrasEmail"
                                label = "Email:"
                            ></v-text-field>
                        </v-col>
                    </v-row>
                    <v-row>
                        <v-col>
                            <v-text-field
                                v-model = "identificador"
                                :rules = "regrasIdentificador"
                                label = "CPF/CNPJ:"
                            ></v-text-field>
                        </v-col>
                    </v-row>
                    <v-row>
                        <v-col>
                            <v-text-field
                                v-model="senha"
                                :rules = "regrasSenha"
                                label ="Senha:"
                                type = "password"
                            ></v-text-field>
                        </v-col>
                    </v-row>
                    <v-row>
                        <v-col>
                            <v-text-field
                                v-model = "senhaC"
                                :rules = "regrasSenhaC"
                                label = "Confirme sua Senha:"
                                type="password"
                            ></v-text-field>
                        </v-col>
                    </v-row>
                    <v-row>
                        <v-col>
                            <v-btn
                                :disabled = "!valid"
                                color="error"
                                class = "ml-auto"
                                @click = "cadastrar"
                            >Cadastrar-se</v-btn>
                        </v-col>
                    </v-row>
                </v-container>
            </h-form>
            </div>
        </v-col>
    </v-row>
</v-container>
</template>
<script>

export default
{
    name : 'CadastroH',
    data : () =>({
        valid : true,
        msg : '',
        nome : '',
        regrasNome : [
            v => !!v || 'Nome e obrigatorio para cadastrar',
        ],
        email : '',
        regrasEmail : [
            v => !!v || 'Email e obrigatorio para cadastrar',
            v => /.+@.+\..+/.test(v) || 'Email deve ser valido'

        ],
        identificador : '',
        regrasIdentificador : [
            v => !!v || 'CPF/CNPJ e obrigatorio para cadastrar',
        ],
        senha : '',
        regrasSenha : [
            v => !!v || 'Senha e obrigatorio para cadastrar',
        ],
        senhaC : '',
        regrasSenhaC : [
            v => !!v || 'Confirmar senha e obrigatorio para cadastrar',
        ]
    }),
    methods: {
        cadastrar()
        {
        },
    },
}
</script>
<style scoped lang="scss">
*{
    margin: 0px;
    padding: 0px;
}
.envelope
{
    width: fit-content;
    box-sizing: fit-content;
    background-color: rgba(#FFFFFF, 0.5);
    align-items: center;
    border-radius: 0.4rem;
}
.centralizar
{
    display: flex;
    justify-content: center;
    align-items: center;
}
</style>
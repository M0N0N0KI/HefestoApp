<template>
<div class="fundo">
   <v-app-bar
      app
      color="#000000"
      dark
    >
      <div class="d-flex align-center">
        <h1>HEFESTO</h1>
      </div>

      <v-spacer></v-spacer>

      <v-btn
        @click="iToLogin"
        text
      >
        <span class="mr-2">{{ iTologinbtn }}</span>
        <v-icon>{{ iTologinicon }}</v-icon>
      </v-btn>
    </v-app-bar>
  <cadastro-h v-if="!telaLogin"></cadastro-h>
  <login-h v-if="telaLogin"></login-h>
</div>
</template>

<script>
  import CadastroH from '@/components/CadastroH.vue'
  import LoginH from '@/components/LoginH.vue'

  export default {
    name: 'Home',

    components: 
    {
      CadastroH,
      LoginH,
    },
    data : () => ({
      telaLogin : false,
      iTologinbtn : 'Entrar',
      iTologinicon : 'mdi-login'
    }),
    methods : 
    {
      iToLogin()
      {
        if(this.telaLogin === true)
        {
          this.telaLogin = false;
          this.iTologinbtn = 'Entrar'
          this.iTologinicon = 'mdi-login'
        }
        else
        {
          this.telaLogin = true;
          this.iTologinbtn = 'Voltar'
          this.iTologinicon = 'mdi-arrow-left-top'
        }
      },
    },
  }
</script>
<style scoped lang="scss">
.fundo
{
  width: 100%;
  height: 100%;
  background-image: url("@/assets/image/background.png");
  background-size: cover;
}
</style>

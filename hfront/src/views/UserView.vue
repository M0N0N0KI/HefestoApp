<template>
<div class="fundo">
    <v-app-bar
      app
      color="#000000"
      dark
    >
      <div class="d-flex align-center">
        <h1 v-if = "usuario != null">{{ this.usuario.nome }}</h1>
        <h1 v-if = "usuario === null">HEFESTO</h1>
      </div>

      <v-spacer></v-spacer>

      <v-btn
        @click="sairH"
        text
      >
        <span class="mr-2">Sair</span>
        <v-icon> mdi-logout</v-icon>
      </v-btn>
    </v-app-bar>
</div>
</template>
<script>
export default
{
    name : 'userv',
    usuario : null,
    component:
    {

    },
    methods: {
        sairH()
        {
            this.usuario = null
            this.$session.destroy()
            this.$router.push("/")
        }
        
    },
    beforeMount() {
        if(this.$session.exists()) this.usuario = this.$session.get('usuario');
        else
        {
            this.$router.push("/");
        }
        
    },
}
</script>
<style scoped lang="scss">
.fundo
{
  width: 100%;
  height: 100%;
}
</style>
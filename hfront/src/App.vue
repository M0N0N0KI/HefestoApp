<template>
  <v-app>
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
        href="#"
        text
      >
        <span class="mr-2">Entrar</span>
        <v-icon>mdi-open-in-new</v-icon>
      </v-btn>
    </v-app-bar>

    <v-main>
      <router-view/>
    </v-main>
  </v-app>
</template>

<script>

export default {
  name: 'App',

  data: () => ({
    //
  }),
};
</script>

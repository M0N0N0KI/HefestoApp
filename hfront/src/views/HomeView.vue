<template>
<div class="fundo">
  <cadastro-h></cadastro-h>
</div>
</template>

<script>
  import CadastroH from '@/components/CadastroH.vue'

  export default {
    name: 'Home',

    components: {
      CadastroH,
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

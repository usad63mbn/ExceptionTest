<template>
  <v-container
    class="d-flex flex-column align-center py-5 unified-container"
    style="background-color: #1976d2; height: 100vh"
  >
    <v-avatar size="100" class="mb-4">
      <img src="https://via.placeholder.com/100" alt="Profile Picture" />
    </v-avatar>
    <v-typography class="white--text mb-2" variant="h6">홍길동</v-typography>
    <v-divider class="white--text mb-2" style="width: 100%"></v-divider>
    <button
      class="white--text text-uppercase my-2"
      style="border: none; background: transparent"
      @click="handleActivityClick"
    >
      나의 활동
    </button>
    <v-divider class="white--text mb-2" style="width: 100%"></v-divider>
    <button
      class="white--text text-uppercase my-2"
      style="border: none; background: transparent"
      @click="handleInfoUpdateClick"
    >
      회원정보 수정
    </button>
    <v-divider class="white--text mb-2" style="width: 100%"></v-divider>
    <button
      class="white--text text-uppercase my-2"
      style="border: none; background: transparent"
      @click="handlePasswordChangeClick"
    >
      비밀번호 변경
    </button>
  </v-container>
</template>

<script setup>
import { Button } from "bootstrap";

function handleActivityClick() {
  alert("나의 활동 버튼 클릭됨");
}

function handleInfoUpdateClick() {
  alert("회원정보 수정 버튼 클릭됨");
}

function handlePasswordChangeClick() {
  alert("비밀번호 변경 버튼 클릭됨");
}
</script>

<style scoped>
.unified-container {
  max-width: 300px;
  max-height: 600px;
  margin: auto;
}

.unified-card {
  min-height: 300px; /* 두 컴포넌트의 높이를 맞추기 위해 최소 높이 설정 */
  padding: 16px; /* 통일된 내부 패딩 추가 */
}

v-avatar img {
  object-fit: cover;
}
</style>

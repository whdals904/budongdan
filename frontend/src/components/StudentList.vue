<template>
    <v-table theme="dark" style="max-width:50%">
      <thead>
      <tr>
        <th class="text-left">
          Name
        </th>
        <th class="text-left">
          Calories
        </th>
      </tr>
      </thead>
      <tbody>
      <tr
          v-for="item in students"
          :key="item.name"
      >
        <td>{{ item.name }}</td>
        <td>{{ item.age }}</td>
      </tr>
      </tbody>
    </v-table>
    <v-btn v-on:click="getStudents">Students</v-btn>
    <v-btn v-on:click="clearStudents">Clear</v-btn>
</template>

<script>
import axios from 'axios';
export default {
  name: 'StudentList',
  data() {
    return{
      students: []
    }
  },
  methods: {
    getStudents: function () {
      axios.get('/students')
          .then((Response) => {
            this.students = Response.data;
          })
    },
    clearStudents: function () {
      this.students = null;
    }
  },
  watch: {
    group () {
      this.drawer = false
    },
  },
}
</script>

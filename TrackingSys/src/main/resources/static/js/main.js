



Vue.component('messages-list',{
props: ['messages'],
template:'<div><div v-for="message in messages">{{ message.text }}</div></div>'
});

var app = new Vue({
  el: '#app',
  template: '<messages-list :messages="messages"/>',
  data: {
    messages:[
    { id:'123', text: 'Wow'},
    { id:'13', text: 'Meen'},
    { id:'3', text: 'Sometext'},
    ]
  }
});
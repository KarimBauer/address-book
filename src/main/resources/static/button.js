// Create a Vue application
const app = Vue.createApp({})

// Define a new global component called button-counter
app.component('button-counter', {
    data() {
        return {
            count: 0
        }
    },
    template: `
    <div>
        <button @click="count++">
          You clicked me {{ count }} times.
        </button>
    </div>`
})
app.mount('#button-counter')
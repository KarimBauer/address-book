const app = Vue.createApp({
    data() {
        return {
            currentTab: 'Home',
            tabs: ['Home', 'Adresses', 'About']
        }
    },
    computed: {
        currentTabComponent() {
            return 'tab-' + this.currentTab.toLowerCase()
        }
    }
})

app.component('tab-home', {
    template: `<div class="demo-tab">Welcome to the Adress-book!</div>`
})
app.component('tab-adresses', {
    template: `<div class="demo-tab">Here you can find your adresses</div>`
})
app.component('tab-about', {
    template: `<div class="demo-tab">This is a dynamic vue example</div>`
})

app.mount('#dynamic-component-demo')
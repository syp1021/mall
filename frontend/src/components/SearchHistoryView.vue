<template>

    <v-data-table
        :headers="headers"
        :items="searchHistory"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'SearchHistoryView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            searchHistory : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/searchHistories'))

            temp.data._embedded.searchHistories.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.searchHistory = temp.data._embedded.searchHistories;
        },
        methods: {
        }
    }
</script>


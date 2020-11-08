<template>
  <div>
    <div v-if="isLoading">
      <progress class="progress is-small is-primary" max="100">15%</progress>
    </div>

    <div v-else>
      <div
        v-if="this.storeForecastsError"
        class="notification is-danger is-light mt-3"
      >
        {{ this.storeForecastsError }}
      </div>
      <div v-else>
        <div
          v-for="forecast in this.storeForecasts"
          :key="forecast.id"
          class="box"
        >
          <div class="is-size-3 mb-5">
            {{ getWeekDay(forecast.date) }}, {{ forecast.date }}
          </div>

          <forecast-night :forecast="forecast" />
          <forecast-day :forecast="forecast" />
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import { mapState } from 'vuex'
export default {
  name: 'daily-forecast',
  data() {
    return {
      isLoading: false,
    }
  },
  computed: {
    ...mapState({
      storeForecasts: (state) => state.forecasts,
      storeForecastsError: (state) => state.forecastsError,
    }),
  },
  mounted: function () {
    this.$nextTick(function () {
      this.fetchForecasts()
    })
  },
  methods: {
    async fetchForecasts() {
      this.isLoading = true
      await this.$store.dispatch('fetchForecasts')
      this.isLoading = false
    },
    getWeekDay(date) {
      var weekday = new Array(7)
      weekday[0] = 'Sunday'
      weekday[1] = 'Monday'
      weekday[2] = 'Tuesday'
      weekday[3] = 'Wednesday'
      weekday[4] = 'Thursday'
      weekday[5] = 'Friday'
      weekday[6] = 'Saturday'
      var dayAsNum = new Date(date).getDay()
      var dayAsString = weekday[dayAsNum]
      return dayAsString
    },
  },
}
</script>

<style></style>

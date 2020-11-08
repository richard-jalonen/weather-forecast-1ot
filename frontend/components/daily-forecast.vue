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

          <article class="media">
            <div class="media-left">
              <figure class="image is-64x64">
                <img
                  v-bind:src="
                    '/weather-icons/' + forecast.night.phenomenon + '_night.svg'
                  "
                  alt="Forecast icon"
                />
              </figure>
            </div>
            <div class="media-content">
              <div class="content">
                <p>
                  <strong>Night</strong>
                  <br />
                  <small
                    >{{ forecast.night.tempmin }}...{{
                      forecast.night.tempmax
                    }}°C, {{ forecast.night.phenomenon }}
                  </small>
                  <br />
                </p>

                <div>
                  {{ forecast.night.text }}
                </div>
              </div>
              <nav class="level is-mobile">
                <div class="level-left">
                  <a class="level-item" aria-label="reply">
                    <span class="icon is-small">
                      <i class="fas fa-reply" aria-hidden="true"></i>
                    </span>
                  </a>
                  <a class="level-item" aria-label="retweet">
                    <span class="icon is-small">
                      <i class="fas fa-retweet" aria-hidden="true"></i>
                    </span>
                  </a>
                  <a class="level-item" aria-label="like">
                    <span class="icon is-small">
                      <i class="fas fa-heart" aria-hidden="true"></i>
                    </span>
                  </a>
                </div>
              </nav>
            </div>
          </article>

          <article class="media">
            <div class="media-left">
              <figure class="image is-64x64">
                <img
                  v-bind:src="
                    '/weather-icons/' + forecast.day.phenomenon + '.svg'
                  "
                  alt="Forecast icon"
                />
              </figure>
            </div>
            <div class="media-content">
              <div class="content">
                <p>
                  <strong>Day</strong>
                  <br />
                  <small
                    >{{ forecast.day.tempmin }}...{{ forecast.day.tempmax }}°C,
                    {{ forecast.day.phenomenon }}
                  </small>
                  <br />
                </p>

                <div>
                  {{ forecast.day.text }}
                </div>
              </div>
              <nav class="level is-mobile">
                <div class="level-left">
                  <a class="level-item" aria-label="reply">
                    <span class="icon is-small">
                      <i class="fas fa-reply" aria-hidden="true"></i>
                    </span>
                  </a>
                  <a class="level-item" aria-label="retweet">
                    <span class="icon is-small">
                      <i class="fas fa-retweet" aria-hidden="true"></i>
                    </span>
                  </a>
                  <a class="level-item" aria-label="like">
                    <span class="icon is-small">
                      <i class="fas fa-heart" aria-hidden="true"></i>
                    </span>
                  </a>
                </div>
              </nav>
            </div>
          </article>
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

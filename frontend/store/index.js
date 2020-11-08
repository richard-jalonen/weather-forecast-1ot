export const state = () => ({
  forecasts: undefined,
  forecastsError: undefined,
})

export const mutations = {
  setForecasts(state, payload) {
    state.forecasts = payload
  },
  setForecastsError(state, payload) {
    state.forecastsError = payload
  },
}

export const actions = {
  async fetchForecasts({ commit }) {
    commit('setForecastsError', undefined)
    const forecastsData = await this.$axios
      .get('http://localhost:8080/forecast')
      .then((response) => {
        return response.data
      })
      .catch((err) => {
        console.log(err)
        if (err.response) {
          if (err.response.data) commit('setForecastsError', err.response.data)
        } else commit('setForecastsError', err)
      })
    commit('setForecasts', forecastsData)
  },
}

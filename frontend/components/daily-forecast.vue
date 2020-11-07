<template>
  <div>
    <div class="box">
      <div class="is-size-3 mb-5">
        {{ getWeekDay('2020-11-08') }}, 2020-11-08
      </div>
      <article class="media">
        <div class="media-left">
          <figure class="image is-64x64">
            <img src="/Moon.svg" alt="Image" />
          </figure>
        </div>
        <div class="media-content">
          <div class="content">
            <p>
              <strong>Night</strong>
              <br />
              <small>5-10°C, Light rain</small>
              <br />
            </p>

            <div>
              Cloudy with rain in many places. Southwest, west wind 4-8, in
              gusts 12, on coastal areas 6-11, in gusts up to 17 m/s, after
              midnight veering to northwest, north and some decreasing. Air
              temperature 5..10°C.
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
            <img src="/Sun.svg" alt="Image" />
          </figure>
        </div>
        <div class="media-content">
          <div class="content">
            <p>
              <strong>Day</strong>
              <br />
              <small>5-10°C, Light rain</small>
              <br />
            </p>

            <div>
              Cloudy with rain in many places. Southwest, west wind 4-8, in
              gusts 12, on coastal areas 6-11, in gusts up to 17 m/s, after
              midnight veering to northwest, north and some decreasing. Air
              temperature 5..10°C.
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

    <div class="box">
      <div class="is-size-3 mb-5">
        {{ getWeekDay('2020-11-09') }}, 2020-11-09
      </div>
      <article class="media">
        <div class="media-left">
          <figure class="image is-64x64">
            <img src="/Moon.svg" alt="Image" />
          </figure>
        </div>
        <div class="media-content">
          <div class="content">
            <p>
              <strong>Night</strong>
              <br />
              <small>5-10°C, Light rain</small>
              <br />
            </p>

            <div>
              Cloudy with rain in many places. Southwest, west wind 4-8, in
              gusts 12, on coastal areas 6-11, in gusts up to 17 m/s, after
              midnight veering to northwest, north and some decreasing. Air
              temperature 5..10°C.
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
            <img src="/Cloud.svg" alt="Image" />
          </figure>
        </div>
        <div class="media-content">
          <div class="content">
            <p>
              <strong>Day</strong>
              <br />
              <small>5-10°C, Light rain</small>
              <br />
            </p>

            <div>
              Cloudy with rain in many places. Southwest, west wind 4-8, in
              gusts 12, on coastal areas 6-11, in gusts up to 17 m/s, after
              midnight veering to northwest, north and some decreasing. Air
              temperature 5..10°C.
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
</template>

<script>
export default {
  name: 'daily-forecast',
  data() {
    return {}
  },
  mounted: function () {
    this.$nextTick(function () {
      // Code that will run only after the
      // entire view has been rendered
      var weekday = new Array(7)
      weekday[0] = 'Sunday'
      weekday[1] = 'Monday'
      weekday[2] = 'Tuesday'
      weekday[3] = 'Wednesday'
      weekday[4] = 'Thursday'
      weekday[5] = 'Friday'
      weekday[6] = 'Saturday'
      var num = new Date('2020-11-08').getDay()
      var day = weekday[num]
      console.log(day)
    })
  },
  methods: {
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

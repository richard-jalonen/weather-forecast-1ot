<template>
  <article class="media">
    <div class="media-left">
      <figure class="image is-64x64">
        <img
          v-bind:src="'/weather-icons/' + forecast.day.phenomenon + '.svg'"
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
</template>

<script>
export default {
  name: 'forecast-day',
  props: ['forecast'],
}
</script>

<style></style>

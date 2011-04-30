package com.co

class RedditController {

    def redditService

    def index = {
        [cats: redditService.breedCats()]
    }
}

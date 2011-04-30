package com.co

import grails.converters.JSON

class RedditController {

    def redditService

    def index = {
        render redditService.breedCats() as JSON
    }
}

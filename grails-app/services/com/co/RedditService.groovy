package com.co

import grails.converters.JSON

class RedditService {

    static transactional = true

    def breedCats() {
        def cats = []
        (1..10).each {
            cats.add(new Cat(canHasCheeseburger: 10 % it == 0))
        }

        cats
    }

}

package com.co

import grails.converters.JSON

class RedditService {

    static transactional = true

    def breedCats(int size=10) {
        def cats = []
        (1..size).each {
            cats.add(new Cat(canHasCheeseburger: 10 % it == 0))
        }

        cats
    }
}

package com.example.sophie.loggerlastversion

/**
 * Created by Sophie on 2/1/2018.
 */
import mu.KLogging

class SingletonLog {


    private constructor() {
//check its a singleton
        logger.info("Hello World.")
    }

    //use logging
    companion object : KLogging() {
        //make it singleton
        val instance: SingletonLog by lazy {
            SingletonLog()
        }
    }
    //function to be able to make random messages
    fun logDown(string: String) {
        logger.info(string)
    }

}
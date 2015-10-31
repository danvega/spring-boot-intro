package com.toysforshots.taglib

import grails.gsp.TagLib
import org.springframework.stereotype.Component

import java.text.SimpleDateFormat;

@Component
@TagLib
class FormatTagLib {

    def dateFormat = { attrs, body ->
        out << new SimpleDateFormat(attrs.format).format(attrs.date)
    }
}
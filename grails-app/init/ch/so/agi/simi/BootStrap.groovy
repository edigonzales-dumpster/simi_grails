package ch.so.agi.simi

import groovy.transform.CompileStatic

import ch.so.agi.simi.SingleLayer

@CompileStatic
class BootStrap {
    def init = { servletContext ->
        println "FOOOOBAR1"
        //SingleLayer slFixpunkte = new SingleLayer(identifier: "ch.so.agi.av.fixpunkte", inWMS: true, inWGC: true, dataPublished: true).save()
        //SingleLayer slPlzOrtschaft = new SingleLayer(identifier: "ch.so.agi.av.plz_ortschaft", inWMS: false, inWGC: true, dataPublished: true).save()
        //SingleLayer slFoo = new SingleLayer(identifier: 'foo').save()
        SingleLayer slFoo = new SingleLayer( owner: 'Stefan').save()

        println "FOOOOBAR2"

        def singleLayerList = SingleLayer.getAll()
        println singleLayerList



    }
    def destroy = {
    }
}

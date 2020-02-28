package ch.so.agi.simi

abstract class DataProduct {
    String identifier
    //String title
    //String synonymous
    //String description
    //String keywords
    //String remarks
    //boolean inWMS
    //boolean inWGC

    static constraints = {
        identifier nullable: true
        //identifier nullable: false, unique: true
        //inWMS nullable: false
        //inWGC nullable: false
    }

    static mapping = {
        //tablePerHierarchy false
        //inWMS column: 'in_wms'
        //inWGC column: 'in_wgc'
    }
}

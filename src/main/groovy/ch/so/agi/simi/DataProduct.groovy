package ch.so.agi.simi

abstract class DataProduct {
    String identifier
    String title
    //String synonymous
    //String description
    String keywords
    //String remarks
    boolean inWMS
    boolean inWGC

    static constraints = {
        identifier()
        title()
        //synonymous nullable: true
        //description nullable: true
        keywords nullable: true
        //remarks nullable: true
        //identifier nullable: true
        //identifier nullable: false, unique: true
        //inWMS nullable: false
        //inWGC nullable: false
        inWMS()
        inWGC()
    }

    static mapping = {
        //tablePerHierarchy false
        //inWMS column: 'in_wms'
        //inWGC column: 'in_wgc'
    }

    String toString() {
        identifier
    }    
}

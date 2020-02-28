package ch.so.agi.simi

class FacadeLayerSingleLayer {
    boolean visibility
    int rank
    int transparency

    static belongsTo = [facadeLayer: FacadeLayer, singleLayer: SingleLayer]

    static constraints = {
        //visibility nullable: false
        //rank nullable: false
    }
}

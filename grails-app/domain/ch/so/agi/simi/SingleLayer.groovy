package ch.so.agi.simi

class SingleLayer extends SingleActor {
    String owner // reference... wohin/woher?
    boolean dataPublished

    static hasMany = [facadeLayerSingleLayers: FacadeLayerSingleLayer] 

    static constraints = {
        owner nullable: true // temporary
    }
}

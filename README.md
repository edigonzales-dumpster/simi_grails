# simi_grails

## Fragen
- Warum keine Fehlermeldung, wenn das Speichern in `BootStrap.groovy` fehlschlägt? Kann man das Loglevel ändern?
- Standardmässig alles NOT NULL? Kann man ändern in application.yml (siehe GORM Doku)

```
grails create-app ch.so.agi.simi.App
```

```
./grailsw create-domain-class DataProduct
```

Klasse `abstract` machen und nach `src/groovy` verschieben, damit sie nicht persistiert wird.

```
./grailsw create-domain-class SingleActor
```

Dito. Extends `DataProduct`

```
./grailsw create-domain-class SingleLayer
```
```
./grailsw create-domain-class FacadeLayer
```

n-m muss aufgelöst wereden, damit die die zusätzlichen Attribute aus `PropertiesInList` hinzugefügt werden können.
```
./grailsw create-domain-class FacadeLayerSingleLayer
```

```
./grailsw create-controller SingleLayer
./grailsw create-controller FacadeLayer
./grailsw create-controller FacadeLayerSingleLayer
```




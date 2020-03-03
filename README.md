# simi_grails

## Fragen
- Warum keine Fehlermeldung, wenn das Speichern in `BootStrap.groovy` fehlschlägt? Kann man das Loglevel ändern? -> http://docs.grails.org/latest/ref/Domain%20Classes/save.html `failOnError`?
- Standardmässig alles NOT NULL? Kann man ändern in application.yml (siehe GORM Doku)
- Warum sehe ich gewisse Attribute in der Liste nicht? Zu viele? Kann man das forcieren, dass die trotzdem kommen? -> Upsi: https://stackoverflow.com/questions/9221799/grails-scaffolding-is-displaying-fewer-columns-than-the-domain
- ...

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




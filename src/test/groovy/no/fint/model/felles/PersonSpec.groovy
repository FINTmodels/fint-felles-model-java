package no.fint.model.felles

import no.fint.model.relation.RelationType
import no.fint.model.relation.RelationUtil
import spock.lang.Specification

class PersonSpec extends Specification {

    def "Get relation types"() {
        when:
        def relations = RelationUtil.getRelationTypes(Person)

        then:
        relations.size() == 3
    }

    def "Verify relation type"() {
        when:
        def relationType = new RelationType(rel)

        then:
        relationType.isValid()
        relationType.containsClass(Person)

        where:
        rel                           | _
        Person.REL_ID_PERSONALRESSURS | _
        Person.REL_ID_KJONN           | _
        Person.REL_ID_STATSBORGERSKAP | _
    }
}

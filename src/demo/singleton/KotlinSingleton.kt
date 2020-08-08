package demo.singleton

import java.util.*

enum class PolicyType{
    TP,
    COMPREHENSIVE,
    OD;

    fun odPolicyType(): String = "great OD"
}

sealed class EntityComponent{

    object ObjectData{
        val someData: String = "Some Data"
    }

    data class TP(val name: String, val tpPremium: Double): EntityComponent()
    data class COMPREHENSIVE(val name: String, val odPremium: Double, val tpPremium: Double): EntityComponent()
    data class OD(val name: String, val odPremium: Double): EntityComponent()
}


class EntityMediator{
    fun createComponent(policyType:PolicyType): EntityComponent{
        var name: String =
                when(policyType){
                    PolicyType.TP -> policyType.name
                    PolicyType.OD -> policyType.odPolicyType()
                    PolicyType.COMPREHENSIVE -> policyType.name
                }
        println(name)

        val entityComponent: EntityComponent = createEntityComponent(policyType)
        return entityComponent;
    }

    private fun createEntityComponent(policyType: PolicyType): EntityComponent {
        return when (policyType) {
            PolicyType.COMPREHENSIVE -> EntityComponent.COMPREHENSIVE("Comprehensive", 200.0, 300.0)
            PolicyType.TP -> EntityComponent.TP("TP", 300.0)
            PolicyType.OD -> EntityComponent.OD("OD", 200.0)
        }
    }
}



object EntitySingleton{
    fun createEntity():Entity {
        var uuid: String = UUID.randomUUID().toString()
        return Entity(name ="Bishal" , id = uuid)
    }
}

class Entity(val id: String, val name: String) {
    override fun toString(): String {
        return "$name $id"
    }
}

fun main() {
    val entity = EntitySingleton.createEntity()
    print(entity)
    val entity2 = EntitySingleton.createEntity()
    print(entity2)
    println("---------------------Sealed Class----------------")
    val entityMediator: EntityMediator = EntityMediator()
    val entityComponent1: EntityComponent = entityMediator.createComponent(PolicyType.TP)
    val entityComponent4: EntityComponent = entityMediator.createComponent(PolicyType.TP)
    val entityComponent2: EntityComponent = entityMediator.createComponent(PolicyType.OD)
    val entityComponent3: EntityComponent = entityMediator.createComponent(PolicyType.COMPREHENSIVE)
    println()
    printTheDetails(entityComponent1);
    printTheDetails(entityComponent2);
    printTheDetails(entityComponent3);

    println("${entityComponent1 == entityComponent4}")
    println("${entityComponent1 === entityComponent4}")

}

fun printTheDetails(entityComponent: EntityComponent) {
    when(entityComponent){
        is EntityComponent.OD -> println("name: ${entityComponent.name}, OD Premium: ${entityComponent.odPremium} ")
        is EntityComponent.TP -> println("name: ${entityComponent.name}, TP Premium: ${entityComponent.tpPremium} ")
        is EntityComponent.COMPREHENSIVE -> println("name: ${entityComponent.name}, OD Premium: ${entityComponent.odPremium}, TP Premium: ${entityComponent.tpPremium} ")
    }
}


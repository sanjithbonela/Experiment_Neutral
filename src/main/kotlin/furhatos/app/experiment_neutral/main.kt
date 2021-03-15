package furhatos.app.experiment_neutral

import furhatos.app.experiment_neutral.flow.*
import furhatos.skills.Skill
import furhatos.flow.kotlin.*

class Experiment_neutralSkill : Skill() {
    override fun start() {
        Flow().run(Idle)
    }
}

fun main(args: Array<String>) {
    Skill.main(args)
}

package net.ccbluex.liquidbounce.features.module.modules.cn

import net.ccbluex.liquidbounce.event.NotificationEvent
import net.ccbluex.liquidbounce.event.handler
import net.ccbluex.liquidbounce.features.module.Category
import net.ccbluex.liquidbounce.features.module.Module
import net.ccbluex.liquidbounce.utils.client.StateUpdateEvent
import net.ccbluex.liquidbounce.utils.client.notification
    object ModuleIQBoost : Module("IQBoost", Category.CN) {

        val iq by text("提升的智商", "250")

        val repeatable = handler<StateUpdateEvent> {

        }

        override fun enable() {
            notification("IQ提升成功", "已经为您提升了" + iq + "IQ", NotificationEvent.Severity.INFO)
        }


        override fun disable()
        {
            notification("IQ已经降低", "已经为您降低了" + iq + "IQ", NotificationEvent.Severity.INFO)
        }


    }

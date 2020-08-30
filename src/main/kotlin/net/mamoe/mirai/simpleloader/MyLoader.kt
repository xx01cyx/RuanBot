package net.mamoe.mirai.simpleloader

import kotlinx.coroutines.*
import net.mamoe.mirai.Bot
import net.mamoe.mirai.alsoLogin
import net.mamoe.mirai.join
import net.mamoe.mirai.message.data.At
import net.mamoe.mirai.contact.Member
import net.mamoe.mirai.event.subscribeMessages

suspend fun main() {
    val qqId = 3211983711L//Bot的QQ号，需为Long类型，在结尾处添加大写L
    val password = "20200830bot"//Bot的密码
    val miraiBot = Bot(qqId, password).alsoLogin()//新建Bot并登录
    miraiBot.subscribeMessages {
        "你好" reply "你好！"
        case("at me") {
            reply(At(sender as Member) + "你的小可爱来辣！")
        }

        (contains("曹沅欣") or contains("cyx")) {
            reply("BI BI BI---------")
        }

        (contains("万金易") or contains("wjy")) {
            reply("数分之王！")
        }

        (contains("黄玮佳") or contains("hwj")) {
            reply("常暗女朋友！")
        }

        (contains("赵栀鹰") or contains("zzy")) {
            reply("宇宙大可爱！")
        }

        (contains("谢明清") or contains("xmq")) {
            reply("是可爱的小企鹅！")
        }

        (contains("黄韵文") or contains("hyw")) {
            reply("咋瓦鲁多！！！")
        }

        (contains("蒋韫玮") or contains("jyw")) {
            reply("来一杯长岛冰茶！")
        }
    }
    miraiBot.join() // 等待 Bot 离线, 避免主线程退出
}
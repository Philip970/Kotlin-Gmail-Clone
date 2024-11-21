package com.mdc.gmailclone

import com.mdc.gmailclone.model.Account
import com.mdc.gmailclone.model.MailData

val mailList = listOf(
    MailData(mailId = 1, userName = "Kenny Ackerman", subject = "Message for Eren", body = "Eren, we need to talk. Meet me at the usual place tonight.", timeStamp = "20:00"),
    MailData(mailId = 2, userName = "Mikasa Ackerman", subject = "Training Session", body = "Mikasa, your training session has been rescheduled to 10 AM.", timeStamp = "10:30"),
    MailData(mailId = 3, userName = "Armin Arlert", subject = "Strategy Meeting", body = "Armin, we need your insights for the upcoming strategy meeting. Let's meet at 3 PM in the conference room.", timeStamp = "15:00"),
    MailData(mailId = 4, userName = "Levi Ackerman", subject = "Titan Survey Corps Report", body = "Captain Levi, please submit your latest Titan survey report by the end of the week.", timeStamp = "09:45"),
    MailData(mailId = 5, userName = "Erwin Smith", subject = "Leadership Conference", body = "Erwin, there will be a leadership conference next Monday. Your presence is crucial.", timeStamp = "14:20"),
    MailData(mailId = 6, userName = "Hange Zoë", subject = "Titan Research Update", body = "Hange, can you share the latest updates on your Titan experiments? Let's discuss your findings in our next meeting.", timeStamp = "11:35"),
    MailData(mailId = 7, userName = "Reiner Braun", subject = "Status Report", body = "Reiner, we need a status report on your current assignment.", timeStamp = "12:10"),
    MailData(mailId = 8, userName = "Bertholdt Hoover", subject = "Field Operations", body = "Bertholdt, your presence is required for the field operations briefing at 9 AM.", timeStamp = "09:00"),
    MailData(mailId = 9, userName = "Annie Leonhart", subject = "Combat Training", body = "Annie, ensure you're prepared for the advanced combat training scheduled for Friday.", timeStamp = "16:50"),
    MailData(mailId = 10, userName = "Jean Kirstein", subject = "Patrol Duty", body = "Jean, you're assigned to patrol duty this weekend.", timeStamp = "13:40"),
    MailData(mailId = 11, userName = "Sasha Blouse", subject = "Supplies Inventory", body = "Sasha, please check the supplies inventory and report back.", timeStamp = "10:05"),
    MailData(mailId = 12, userName = "Connie Springer", subject = "Recon Mission", body = "Connie, prepare for the recon mission briefing at 2 PM.", timeStamp = "14:00"),
    MailData(mailId = 13, userName = "Historia Reiss", subject = "Royal Duties", body = "Queen Historia, your royal duties for the next week have been outlined. Please review them at your earliest convenience.", timeStamp = "17:15"),
    MailData(mailId = 14, userName = "Ymir", subject = "Confidential Meeting", body = "Ymir, we need to discuss some confidential matters. Meet me at the usual place tonight.", timeStamp = "19:30"),
    MailData(mailId = 15, userName = "Zeke Jaeger", subject = "Strategic Plans", body = "Zeke, your strategic plans for the next phase are required urgently.", timeStamp = "08:45"),
    MailData(mailId = 16, userName = "Pieck Finger", subject = "Titan Armor Maintenance", body = "Pieck, ensure that the Titan armor is maintained and ready for deployment.", timeStamp = "11:50"),
    MailData(mailId = 17, userName = "Porco Galliard", subject = "Mission Debrief", body = "Porco, the mission debrief is scheduled for tomorrow at 10 AM. Please be on time.", timeStamp = "10:00"),
    MailData(mailId = 18, userName = "Falco Grice", subject = "Training Review", body = "Falco, your recent training performance will be reviewed. Meet your instructor at 3 PM.", timeStamp = "15:30"),
    MailData(mailId = 19, userName = "Gabi Braun", subject = "Evaluation Meeting", body = "Gabi, please attend your evaluation meeting this afternoon at 2 PM.", timeStamp = "14:00"),
    MailData(mailId = 20, userName = "Floch Forster", subject = "Squad Assignment", body = "Floch, you've been assigned to a new squad. Report to HQ for details.", timeStamp = "11:00"),
    MailData(mailId = 21, userName = "Marco Bodt", subject = "Tactical Planning", body = "Marco, join us for the tactical planning session tomorrow morning.", timeStamp = "09:00"),
    MailData(mailId = 22, userName = "Hannes", subject = "Wall Defense Report", body = "Hannes, please submit your report on the current wall defenses by the end of today.", timeStamp = "18:00"),
    MailData(mailId = 23, userName = "Keith Shadis", subject = "Cadet Training Program", body = "Keith, we need to update the cadet training program. Let's discuss the changes on Thursday.", timeStamp = "13:15"),
    MailData(mailId = 24, userName = "Dot Pixis", subject = "Command Briefing", body = "Commander Pixis, please attend the command briefing at 1 PM in the strategy room.", timeStamp = "13:00"),
    MailData(mailId = 25, userName = "Rico Brzenska", subject = "Guard Duty Schedule", body = "Rico, your guard duty schedule has been updated. Check the new timings in the HQ.", timeStamp = "08:30"),
    MailData(mailId = 26, userName = "Nile Dok", subject = "Military Police Meeting", body = "Nile, there's a meeting for all Military Police commanders at 10 AM.", timeStamp = "10:00"),
    MailData(mailId = 27, userName = "Petra Ral", subject = "Squad Report", body = "Petra, please compile the latest squad report and submit it by tomorrow.", timeStamp = "09:30"),
    MailData(mailId = 28, userName = "Oluo Bozado", subject = "Maneuver Gear Maintenance", body = "Oluo, ensure all maneuver gear is in top condition before the next mission.", timeStamp = "12:45"),
    MailData(mailId = 29, userName = "Eld Jinn", subject = "Team Debrief", body = "Eld, the team debrief is scheduled for 4 PM. Be prepared to discuss your observations.", timeStamp = "16:00"),
    MailData(mailId = 30, userName = "Gunther Schultz", subject = "Supply Chain Management", body = "Gunther, oversee the supply chain management for the upcoming expedition. Ensure all supplies are accounted for.", timeStamp = "17:00")
)

val accountList = listOf<Account>(
    Account(icon = R.drawable.eren, userName = "Eren Yaeger", email = "eren.yeager@paradis.com", unreadMails = 150),
    Account(userName = "Eren Yaeger", email = "e.yaeger@scouts.org", unreadMails = 66),
    Account(userName = "Eren Yaeger", email = "y.eren@wallsdefense.net", unreadMails = 15),
)
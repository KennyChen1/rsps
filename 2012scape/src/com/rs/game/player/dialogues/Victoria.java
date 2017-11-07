package com.rs.game.player.dialogues;

import com.rs.utils.Utils;

public class Victoria extends Dialogue {

	int npcId;

	
	@Override
	public void start() {
		npcId = (Integer) parameters[0];
		sendPlayerDialogue(9827, "Good day.");
	}

	@Override
	public void run(int interfaceId, int componentId) {
		switch(stage){
			case -1:
				sendNPCDialogue(npcId, 9827, "To you too, traveller. I am victoria. Tell me, have you seen my brother, Lachtopher around the town?"  );
				stage = 1;
				break;
			case 1:
				sendOptionsDialogue("What would you like to say?", "Yes, I've seen Lachtopher", "No, I haven't seen him");
				stage = 2;
				break;
			case 2:
				if(componentId == OPTION_1){
					sendNPCDialogue(npcId, 9827, "Ah, he'll have asked you for money, no doubt. I hope you didn't give him any.");
					stage = 20;
				} else if(componentId == OPTION_2){
					sendNPCDialogue(npcId, 9827, "Well, if you do meet him, he'll ask you for money, no doubt. Please don't give him any.");
					stage  = 40;
				}				
				break;
			case 20: 
				sendOptionsDialogue("What would you like to say?", "No, I didn't give him a single coin.", "Yes, I loaned him money, just like he asked.");
				stage = 21;
				break;
			case 21:
				sendNPCDialogue(npcId, 9827, "Oh, good! If you had, then you would never have got it back. "
						+ "My brother is such a waste of space. I've been lending him things for years and he never gives them back.");
				stage = 22;
				break;
			case 22:
				sendNPCDialogue(npcId, 9827, "Yes, but i never used to be this bad. You see.");
				stage = 23;
				break;
			case 23:
				sendNPCDialogue(npcId, 9827, "Lachtopher used to live on the east side of the river, befefore it was overrun with goblins,"
						+ " Although he didn't have a steady job, he used to help out around farms when he needed cash.");
				stage = 24;
				break;
			case 24:
				sendNPCDialogue(npcId, 9827, "Then, one day, the Duke told us it was no longer safe to live on the east riverbank, "
						+ "so some villagers had to move across here.");
				stage = 25;
				break;
			case 25:
				sendNPCDialogue(npcId, 9827, "With no money for lodgings, and no where else to go, Lachtopher came to live with me. "
						+ "I've only a small, house so he sleeps downstairs on the floor.");
				stage = 26;
				break;
			case 26:
				sendPlayerDialogue(9827, "Goodness. That sounds quite uncomfortable.");
				stage = 27;
				break;
			case 27:
				sendNPCDialogue(npcId, 9827, "Not uncomfortable enough, it seems.");
				stage = 28;
				break;
			case 28:
				sendNPCDialogue(npcId, 9827, "I thought he'd only be staying for a couple of weeks, "
						+ "just until he'd got some money together, but he's been here for ages now.");
				stage = 29;
				break;
			case 29:
				sendPlayerDialogue(9827, "So, why not just throw him out on to the streets?");
				stage = 30;
				break;
			case 30:
				sendNPCDialogue(npcId, 9827, "Oh, no! I couldn't do that to my brother.");
				stage = 31;
				break;
			case 31:
				sendNPCDialogue(npcId, 9827, "Besides, my parents taught me to support and care for those in need. "
						+ "I'm sure that, if I try hard enough, I can change my brother's ways");
				stage = 32; 
				break;
			case 32:
				sendNPCDialogue(npcId, 9827, "That doesn't mean he's having any more money out of me, however. "
						+ "He can have a roof over his head, but that's all.");
				stage = 33;
				break;
			case 33:
				sendPlayerDialogue(9827, "Good Luck With that I don't think Lachtopher deserves a sister like you.");
				stage = 34;
			case 34:
				sendNPCDialogue(npcId, 9827, "Such Kind words. Thank you. Remember: don't give him any money - tell him to get a job instead.");
				stage = 35;
				break;
			case 35:
				sendPlayerDialogue(9827, "Okay, I'll try to remember that.");
				stage = 127;
				break;
			case 40:
				sendPlayerDialogue(9827, "Why not?.");
				stage = 41;
				break;
			case 41:
				sendNPCDialogue(npcId, 9827, "Sorry to tell you this, but if you lend him money you'll never see it again. M");
				stage = 127;
				break;
			default: end();
				break;
		}
		
	}

	@Override
	public void finish() {

	}

}

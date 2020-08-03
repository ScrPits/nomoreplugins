package net.runelite.client.plugins.botutils;

import com.google.common.collect.ImmutableSet;
import java.util.Set;
import static net.runelite.api.NullObjectID.NULL_34810;
import net.runelite.api.ObjectID;

public class Banks
{
	public static final Set<Integer> ALL_BANKS = ImmutableSet.of(ObjectID.BANK_BOOTH,
		ObjectID.BANK_BOOTH_10083,
		ObjectID.BANK_BOOTH_10355,
		ObjectID.BANK_BOOTH_10357,
		ObjectID.BANK_BOOTH_10517,
		ObjectID.BANK_CHEST_10562,
		ObjectID.BANK_BOOTH_10584,
		ObjectID.BANK,
		ObjectID.BANK_BOOTH_11338,
		ObjectID.BANK_BOOTH_12798,
		ObjectID.BANK_BOOTH_12799,
		ObjectID.BANK_BOOTH_12800,
		ObjectID.BANK_BOOTH_12801,
		ObjectID.BANK_BOOTH_14367,
		ObjectID.BANK_BOOTH_14368,
		ObjectID.BANK_BOOTH_16642,
		ObjectID.BANK_BOOTH_16700,
		ObjectID.BANK_BOOTH_18491,
		ObjectID.BANK_BOOTH_20325,
		ObjectID.BANK_BOOTH_20326,
		ObjectID.BANK_BOOTH_20327,
		ObjectID.BANK_BOOTH_20328,
		ObjectID.BANK_CHEST_21301,
		ObjectID.BANK_BOOTH_22819,
		NULL_34810,
		ObjectID.BANK_BOOTH_24101,
		ObjectID.BANK_BOOTH_24347,
		ObjectID.BANK_BOOTH_25808,
		ObjectID.BANK_CHEST_26707,
		ObjectID.BANK_CHEST_26711,
		ObjectID.BANK_BOOTH_27254,
		ObjectID.BANK_BOOTH_27260,
		ObjectID.BANK_BOOTH_27263,
		ObjectID.BANK_BOOTH_27265,
		ObjectID.BANK_BOOTH_27267,
		ObjectID.BANK_BOOTH_27292,
		ObjectID.BANK_BOOTH_27718,
		ObjectID.BANK_BOOTH_27719,
		ObjectID.BANK_BOOTH_27720,
		ObjectID.BANK_BOOTH_27721,
		ObjectID.BANK_BOOTH_28429,
		ObjectID.BANK_BOOTH_28430,
		ObjectID.BANK_BOOTH_28431,
		ObjectID.BANK_BOOTH_28432,
		ObjectID.BANK_BOOTH_28433,
		ObjectID.BANK_BOOTH_28546,
		ObjectID.BANK_BOOTH_28547,
		ObjectID.BANK_BOOTH_28548,
		ObjectID.BANK_BOOTH_28549,
		ObjectID.BANK_BOOTH_32666,
		ObjectID.BANK_BOOTH_36559,
		ObjectID.BANK_BOOTH_37959,
		ObjectID.BANK_CHEST,
		ObjectID.BANK_CHEST_4483,
		ObjectID.BANK_CHEST_14382,
		ObjectID.BANK_CHEST_14886,
		ObjectID.BANK_CHEST_16695,
		ObjectID.BANK_CHEST_16696,
		ObjectID.BANK_CHEST_19051,
		ObjectID.BANK_CHEST_28594,
		ObjectID.BANK_CHEST_28595,
		ObjectID.BANK_CHEST_28816,
		ObjectID.BANK_CHEST_28861,
		ObjectID.BANK_CHEST_29321,
		ObjectID.BANK_CHEST_30087,
		ObjectID.BANK_CHEST_30267,
		ObjectID.BANK_CHEST_30926,
		ObjectID.BANK_CHEST_30989,
		ObjectID.BANK_BOX,
		ObjectID.BANK_BOX_31949,
		ObjectID.BANK_CHEST_34343,
		ObjectID.BANK_DEPOSIT_BOX, //Varrock West Bank Deposit Box
		ObjectID.BANK_DEPOSIT_CHEST,
		ObjectID.BANK_DEPOSIT_BOX_25937,
		ObjectID.BANK_DEPOSIT_BOX_26254,
		ObjectID.BANK_DEPOSIT_BOX_29103,
		ObjectID.BANK_DEPOSIT_BOX_29104,
		ObjectID.BANK_DEPOSIT_BOX_29105,
		ObjectID.BANK_DEPOSIT_BOX_29106,
		ObjectID.BANK_DEPOSIT_POT,
		ObjectID.BANK_DEPOSIT_BOX_29327,
		ObjectID.BANK_DEPOSIT_BOX_30268,
		ObjectID.BANK_DEPOSIT_BOX_31726,
		ObjectID.BANK_DEPOSIT_BOX_32665,
		ObjectID.BANK_DEPOSIT_BOX_34344,
		ObjectID.BANK_DEPOSIT_BOX_36086);

	public static final Set<Integer> BANK_SET = ImmutableSet.of(
		ObjectID.BANK_BOOTH,
		ObjectID.BANK_BOOTH_10083,
		ObjectID.BANK_BOOTH_10355,
		ObjectID.BANK_BOOTH_10357,
		ObjectID.BANK_BOOTH_10517,
		ObjectID.BANK_CHEST_10562,
		ObjectID.BANK_BOOTH_10584,
		ObjectID.BANK,
		ObjectID.BANK_BOOTH_11338,
		ObjectID.BANK_BOOTH_12798,
		ObjectID.BANK_BOOTH_12799,
		ObjectID.BANK_BOOTH_12800,
		ObjectID.BANK_BOOTH_12801,
		ObjectID.BANK_BOOTH_14367,
		ObjectID.BANK_BOOTH_14368,
		ObjectID.BANK_BOOTH_16642,
		ObjectID.BANK_BOOTH_16700,
		ObjectID.BANK_BOOTH_18491,
		ObjectID.BANK_BOOTH_20325,
		ObjectID.BANK_BOOTH_20326,
		ObjectID.BANK_BOOTH_20327,
		ObjectID.BANK_BOOTH_20328,
		ObjectID.BANK_CHEST_21301,
		ObjectID.BANK_BOOTH_22819,
		NULL_34810,
		ObjectID.BANK_BOOTH_24101,
		ObjectID.BANK_BOOTH_24347,
		ObjectID.BANK_BOOTH_25808,
		ObjectID.BANK_CHEST_26707,
		ObjectID.BANK_CHEST_26711,
		ObjectID.BANK_BOOTH_27254,
		ObjectID.BANK_BOOTH_27260,
		ObjectID.BANK_BOOTH_27263,
		ObjectID.BANK_BOOTH_27265,
		ObjectID.BANK_BOOTH_27267,
		ObjectID.BANK_BOOTH_27292,
		ObjectID.BANK_BOOTH_27718,
		ObjectID.BANK_BOOTH_27719,
		ObjectID.BANK_BOOTH_27720,
		ObjectID.BANK_BOOTH_27721,
		ObjectID.BANK_BOOTH_28429,
		ObjectID.BANK_BOOTH_28430,
		ObjectID.BANK_BOOTH_28431,
		ObjectID.BANK_BOOTH_28432,
		ObjectID.BANK_BOOTH_28433,
		ObjectID.BANK_BOOTH_28546,
		ObjectID.BANK_BOOTH_28547,
		ObjectID.BANK_BOOTH_28548,
		ObjectID.BANK_BOOTH_28549,
		ObjectID.BANK_BOOTH_32666,
		ObjectID.BANK_BOOTH_36559,
		ObjectID.BANK_BOOTH_37959
		);

	public static final Set<Integer> BANK_CHECK_BOX = ImmutableSet.of(
		ObjectID.BANK_CHEST,
		ObjectID.BANK_CHEST_4483,
		ObjectID.BANK_CHEST_14382,
		ObjectID.BANK_CHEST_14886,
		ObjectID.BANK_CHEST_16695,
		ObjectID.BANK_CHEST_16696,
		ObjectID.BANK_CHEST_19051,
		ObjectID.BANK_CHEST_28594,
		ObjectID.BANK_CHEST_28595,
		ObjectID.BANK_CHEST_28816,
		ObjectID.BANK_CHEST_28861,
		ObjectID.BANK_CHEST_29321,
		ObjectID.BANK_CHEST_30087,
		ObjectID.BANK_CHEST_30267,
		ObjectID.BANK_CHEST_30926,
		ObjectID.BANK_CHEST_30989,
		ObjectID.BANK_BOX,
		ObjectID.BANK_BOX_31949,
		ObjectID.BANK_CHEST_34343,
		ObjectID.BANK_DEPOSIT_BOX, //Varrock West Bank Deposit Box
		ObjectID.BANK_DEPOSIT_CHEST,
		ObjectID.BANK_DEPOSIT_BOX_25937,
		ObjectID.BANK_DEPOSIT_BOX_26254,
		ObjectID.BANK_DEPOSIT_BOX_29103,
		ObjectID.BANK_DEPOSIT_BOX_29104,
		ObjectID.BANK_DEPOSIT_BOX_29105,
		ObjectID.BANK_DEPOSIT_BOX_29106,
		ObjectID.BANK_DEPOSIT_POT,
		ObjectID.BANK_DEPOSIT_BOX_29327,
		ObjectID.BANK_DEPOSIT_BOX_30268,
		ObjectID.BANK_DEPOSIT_BOX_31726,
		ObjectID.BANK_DEPOSIT_BOX_32665,
		ObjectID.BANK_DEPOSIT_BOX_34344,
		ObjectID.BANK_DEPOSIT_BOX_36086
	);
}

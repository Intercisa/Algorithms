package firstrepindex;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import firstrepindex.FirstRepeatingCharacterIndex;

class FirstRepeatingCharacterIndexTest {

	@Test
	void test_1() {
		assertEquals(2, new FirstRepeatingCharacterIndex().findFirstIndex("qqewwrrttzzuuiiooppaassddffgghhjjkkllyyxxccvvbbnnmmxbnvbxncvycbsdhhbvgjhdgbiltibfdkjgvbfkjbvdklbskldbsdhbvkvbfklbydilrtgbiutilbnuicbvkdbslbdhbsdliufbhfuzbtgzbgstilhnoufivbifubidbvklvbicvxcbiv"));
	}
}

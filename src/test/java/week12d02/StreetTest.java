package week12d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StreetTest {
    @Test

    public void streetTest(){

        Street street= new Street();

        street.sellSite(new Site(0,10,Fence.PERFECT));
        street.sellSite(new Site(0,7,Fence.NEED_UPGRADE));
        street.sellSite(new Site(1,12,Fence.NEED_UPGRADE));
        street.sellSite(new Site(0,9,Fence.PERFECT));
        street.sellSite(new Site(0,11,Fence.NO_FENCE));
        street.sellSite(new Site(1,13,Fence.PERFECT));

        assertEquals(6,street.getSites().size());

        assertEquals(3,street.LastNumber());

        Result[] results=street.fenceStat();
        assertEquals(2,results[1].getNumber());

    }
}
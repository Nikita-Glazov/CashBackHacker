package ru.netology.service;

import org.testng.annotations.Test;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();
    @Test
    public void testCheckingBoundaryValuesOne() {
        org.testng.Assert.assertEquals(service.remain(0), 1000);
    }

    @Test
    public void testCheckingBoundaryValuesTwo() {
        org.testng.Assert.assertEquals(service.remain(1), 999);
    }

    @Test
    public void testCheckingBoundaryValuesThree() {
        org.testng.Assert.assertEquals(service.remain(999), 1);
    }

    @Test
    public void testCheckingBoundaryValuesFour() {
        org.testng.Assert.assertEquals(service.remain(1000), 0);
    }

    @Test
    public void testCheckingBoundaryValuesFive() {
        org.testng.Assert.assertEquals(service.remain(1001), 999);
    }

    @Test
    public void testRemainCriticalPath() {
        org.testng.Assert.assertEquals(service.remain(400), 600);
    }
}

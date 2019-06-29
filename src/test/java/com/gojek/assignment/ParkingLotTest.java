package tests.com.gojek;

import com.gojek.assignment.InputHandling.CommandPromptHandler;
import com.gojek.assignment.AbstractProcessor.CommandsProcessor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

public class ParkingLotTest {

    static CommandsProcessor processor = null;

    @BeforeEach
    public void setUp() throws Exception {
        processor = new CommandPromptHandler();
        processor.validateAndProcess("create_parking_lot 8");
    }

    @Test
    public void testCreateParkingLot() {
        try {
            processor.validateAndProcess("create_parking_lot 8");
        } catch (Exception e) {
            fail("Creation of parking slot failed");
        }
    }

    @Test
    public void testParkCar() {
        try {
            processor.validateAndProcess("park DL-20-490 Blue");
        } catch (Exception e) {
            fail("Creation of parking slot failed");
        }
    }

    @Test
    public void testGetStatus() {
        try {
            processor.validateAndProcess("status");
        } catch (Exception e) {
            fail("Fetching status failed");
        }
    }

    @Test
    public void testGetRegistrationNumbersFromColor() {
        try {
            processor.validateAndProcess("registration_numbers_for_cars_with_colour Blue");
        } catch (Exception e) {
            fail("registration_numbers_for_cars_with_colour functionality failed");
        }
    }

    @Test
    public void testGetSlotNumberFromRegNo() {
        try {
            processor.validateAndProcess("registration_numbers_for_cars_with_colour 1234");
        } catch (Exception e) {
            fail("registration_numbers_for_cars_with_colour functionality failed");
        }
    }

    @Test
    public void testGetSlotNumbersFromColor() {
        try {
            processor.validateAndProcess("slot_numbers_for_cars_with_colour White");
        } catch (Exception e) {
            fail("slot_numbers_for_cars_with_colour functionality failed");
        }
    }

    public static void main(String[] args) throws Exception {
        ParkingLotTest parkingLotTest = new ParkingLotTest();

        parkingLotTest.setUp();
        parkingLotTest.testCreateParkingLot();
        parkingLotTest.testParkCar();
        parkingLotTest.testGetStatus();
        parkingLotTest.testGetRegistrationNumbersFromColor();
        parkingLotTest.testGetSlotNumberFromRegNo();
        parkingLotTest.testGetSlotNumbersFromColor();

    }
}
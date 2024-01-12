
## Parking Dot

#### User Story

1. Vehicle (User) will come to entry gate (1 entry gate out of many). Controller will take the Car ID and use it to generate ticket.
2. Controller will take input from attendant to open gate for user to go in.
3. Controller will take input from attendant to generate bill.
4. Controller will take input from user to redirect to desired payment gateway, receive a success, and generate receipt.
5. Controller will take input from attendant to open gate.

#### Nouns/Verbs

- Vehicle

    A vehicle class needed to keep it ready for future when more than the CarId can be taken
- ParkingTicket -------> Vehicle, ParkingFloor, ParkingSpot, ParkingGate, ParkingAttendant
    
    A parking ticket which has vehicle details + where to park + where ticket was generated and by whom
- ParkingLot -------> ParkingFloor, Gate
    
    Contains all info about the whole area
- ParkingFloor --------> ParkingSpot
    
    Contains info about the spots on the specific floor
- ParkingSpot
    
    Contains specific information about the spot
- ParkingAttendant
    
    A physical employee associated with serving the user and closing the gap between real world and software world
- Bill -------> Ticket
    
    Generated with reference to the ticket when vehicle arrives at the gateCounter
- Payment -------> Bill

    The payment to be done by the user with his choice
- Receipt -------> Payment
    
    Generated after payment successful
- ParkingGate -------> GateCounter, ParkingAttendant
    
    Gates to control flow of vehicles
- GateCounter
    
    To collect payment at the exit gate

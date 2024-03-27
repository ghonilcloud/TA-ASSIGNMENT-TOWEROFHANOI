class Tower {
    // A recursive function that implements the Tower of Hanoi algorithm
    static void TowerTest(int disk, char starting_rod,
                             char destination_rod, char aux_rod)
    {
        // If the number of disks is 0, there's nothing to do
        if (disk == 0) {
            return;
        }
        // Move n-1 disks from the starting_rod to the aux_rod, moving it out of the way to allow the other
        // disks to be moved.
        TowerTest(disk - 1, starting_rod, aux_rod, destination_rod);
        // Move the nth disk from the starting_rod to the destination_rod.
        System.out.println("Move disk " + disk + " from rod "
                + starting_rod + " to rod "
                + destination_rod);
        // The n-1 disks can now be moved from the aux_rod to the destination rod.x
        TowerTest(disk - 1, aux_rod, destination_rod, starting_rod);
    }

    // Driver code
    public static void main(String args[])
    {
        // Define the number of disks we want to move
        int disk = 3;

        // A, B and C are the names of the rods
        TowerTest(disk, 'A', 'C', 'B');
    }
}
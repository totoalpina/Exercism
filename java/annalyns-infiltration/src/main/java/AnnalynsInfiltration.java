class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        return knightIsAwake == false ? true : false;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        if ( !knightIsAwake && !archerIsAwake && !prisonerIsAwake){
            return false;
        } else {
            return true;
        }
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        return !archerIsAwake && prisonerIsAwake ? true : false;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        if ( petDogIsPresent && !archerIsAwake ){
            return true;
        } else {
            if ( prisonerIsAwake && !archerIsAwake && !knightIsAwake ){
                return true;
            } else {
                return false;
            }
        }
    }
}

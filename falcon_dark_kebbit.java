  if (client.getEnergy() == 10000) {
        v.getWalking().turnRunningOn();
    }
if (!v.getWalking().isMoving() && v.getLocalPlayer().hasAnimation(-1)) {
    NPC falcon = v.getNpc().findNearest(1342);
    NPC kebbit = v.getNpc().findNearest(5532);
    if (v.getInventory().amountInInventory(10115, 10, 28)) {
        v.getInventory().drop(10115);
    } else if (v.getInventory().amountInInventory(526, 10, 28)) {
        v.getInventory().drop(526);
    } else if (falcon != null) {
        v.invoke("Retrieve", "<col=ffff00>Gyr Falcon", falcon.getIndex(), 9, 0, 0, false);
    } else if (kebbit != null) {
        v.getCombat().setTarget(kebbit);
        v.invoke("Catch", "<col=ffff00>Dark kebbit", 15487, 9, 0, 0, false);
    }
}
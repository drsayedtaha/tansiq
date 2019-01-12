package dto;

import java.util.ArrayList;

public class AdminDTO extends UserDTO {
    private ArrayList<Integer> eduLevels;
    public AdminDTO(UserDTO user){
        this.setFirstName(user.getFirstName());
        this.setLastName(user.getLastName());
        this.setMiddleName(user.getMiddleName());
        this.setRole(user.getRole());
        this.setId(user.getId());
        }
    public void setEduLevels(ArrayList<Integer> eduLevels) {
        this.eduLevels = eduLevels;
    }

    public ArrayList<Integer> getEduLevels() {
        return eduLevels;
    }
}

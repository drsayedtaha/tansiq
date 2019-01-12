package dto;

public class StudentDTO extends UserDTO {
    private int totalMark;
    public StudentDTO(UserDTO user){
        this.setFirstName(user.getFirstName());
        this.setLastName(user.getLastName());
        this.setMiddleName(user.getMiddleName());
        this.setRole(user.getRole());
        this.setId(user.getId());
        }
    public void setTotalMark(int totalMark) {
        this.totalMark = totalMark;
    }

    public int getTotalMark() {
        return totalMark;
    }
}

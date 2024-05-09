
import java.util.*;
class Date {
    private int day;
    private String month;
    private int year;

    public Date(int day, String month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return day + "-" + month + "-" + year;
    }
}

class Member {
    private int ID;
    private String lastName;
    private String firstName;
    int handicap;
    private char gender;
    private String team;
    private String memberType;
    private int coach;
    private long phone;
    private Date joinDate;

    public Member(int ID, String lastName, String firstName, int handicap, char gender, String team, String memberType, int coach, long phone, Date joinDate) {
        this.ID = ID;
        this.lastName = lastName;
        this.firstName = firstName;
        this.handicap = handicap;
        this.gender = gender;
        this.team = team;
        this.memberType = memberType;
        this.coach = coach;
        this.phone = phone;
        this.joinDate = joinDate;
    }

    public void display() {
        System.out.println("Member ID: " + ID);
        System.out.println("Last Name: " + lastName);
        System.out.println("First Name: " + firstName);
        System.out.println("Handicap: " + handicap);
        System.out.println("Gender: " + gender);
        System.out.println("Team: " + team);
        System.out.println("Member Type: " + memberType);
        System.out.println("Coach: " + coach);
        System.out.println("Phone: " + phone);
        System.out.println("Join Date: " + joinDate);
        System.out.println();
    }

    public boolean isSenior() {
        return (handicap < 12);
    }

    public boolean isFemale() {
        return (gender == 'F');
    }

    public boolean isTeamB() {
        return (team != null && team.equals("TeamB"));
    }
    

    public boolean joinedBefore(Date date) {
        return joinDate.toString().compareTo(date.toString()) < 0;
    }
}

public class dsaProject {
    public static void main(String[] args) {
       
        Member[] members = {
            new Member(118, "McKenzie", "Melissa", 30, 'F', null, "Junior", 153, 963270, new Date(28, "May", 2005)),
            new Member(138, "Stone", "Michael", 30, 'M', null, "Senior", 0, 983223, new Date(31, "May", 2009)),
            new Member(153, "Nolan", "Brenda", 11, 'F', "TeamB", "Senior", 0, 442649, new Date(12, "Aug", 2006)),
            new Member(176, "Branch", "Helen", 0, 'F', null, "Social", 0, 589419, new Date(6, "Dec", 2011)),
            new Member(178, "Beck", "Sarah", 0, 'F', null, "Social", 0, 226596, new Date(24, "Jan", 2010)),
            new Member(228, "Burton", "Sandra", 26, 'F', null, "Junior", 153, 244493, new Date(9, "Jul", 2013)),
            new Member(235, "Cooper", "William", 14, 'M', "TeamB", "Senior", 153, 722954, new Date(5, "Mar", 2008)),
            new Member(239, "Spence", "Thomas", 10, 'M', null, "Senior", 0, 697720, new Date(22, "Jun", 2006)),
            new Member(258, "Olson", "Barbara", 16, 'F', null, "Senior", 0, 370186, new Date(29, "Jul", 2013)),
            new Member(286, "Pollard", "Robert", 19, 'M', "TeamB", "Junior", 235, 617681, new Date(13, "Aug", 2013)),
            new Member(290, "Sexton", "Thomas", 26, 'M', null, "Senior", 235, 268936, new Date(28, "Jul", 2008)),
            new Member(323, "Wilcox", "Daniel", 3, 'M', "TeamA", "Senior", 0, 665393, new Date(18, "May", 2009)),
            new Member(331, "Schmidt", "Thomas", 25, 'M', null, "Senior", 153, 867492, new Date(7, "Apr", 2009)),
            new Member(332, "Bridges", "Deborah", 12, 'F',null, "Senior", 235, 279087, new Date(23, "Mar", 2007)),
            new Member(339, "Young", "Betty", 21, 'F', "TeamB", "Senior", 0, 507813, new Date(17, "Apr", 2009)),
            new Member(414, "Gilmore", "Jane", 5, 'F', "TeamA", "Junior", 153, 459558, new Date(30, "May", 2007)),
            new Member(415, "Taylor", "William", 7, 'M', "TeamA", "Senior", 235, 137353, new Date(27, "Nov", 2007)),
            new Member(461, "Reed", "Robert", 3, 'M', "TeamA", "Senior", 235, 994664, new Date(5, "Aug", 2005)),
            new Member(469, "Willis", "Carolyn", 29, 'F',null, "Junior", 0,  688378, new Date(14, "Jan", 2011)),
            new Member(487, "Kent", "Susan", 0, 'F', null, "Social", 0, 707217, new Date(7, "Oct", 2010)),
        };


        System.out.println("Members joined before 07-Apr-09:");
        for (Member member : members) {
            if (member.joinedBefore(new Date(7, "Apr", 2009))) {
                member.display();
            }
        }


        System.out.println("Senior members with handicap less than 12:");
        for (Member member : members) {
            if (member.isSenior() && member.handicap < 12) {
                member.display();
            }
        }


        System.out.println("Female senior members of TeamB:");
        for (Member member : members) {
            if (member.isSenior() && member.isFemale() && member.isTeamB()) {
                member.display();
            }
        }
    }
}

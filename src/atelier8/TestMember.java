package atelier8;


import java.util.Arrays;
import java.util.List;

import static atelier8.Member.Type;
import static atelier8.Member.members;
import static java.util.Comparator.comparing;
import java.util.OptionalInt;
public class TestMember {

	public static void main(String[] args) {
		

		
		
		
		
		// 1.Sélectionner les membres ayant l’ « handicap » supérieur à 20 ;
		List<Member> membersH = members.stream().filter(m -> m.getHandicap()>20).toList();
		// 2.Sélectionner les noms (LastName) des « Members »  jouant dans TeamA ; 
		List<String> Names = members.stream().filter(m-> "TeamA".equals(m.getTeam()))
				.map(Member::getLastName).toList();
				

		// 3.Sélectionner les noms (LastName) des « Members» de « Gender » =F ;
		List<String> NamesF = members.stream().filter(m-> m.getGender() == 'F')
				.map(Member::getLastName).toList();
		// 4.Trier les « Members» de type « Junior » en fonction de leur « handicap » ;
		List<Member> TypeM   = members.stream().filter(m-> m.getType() == Member.Type.Junior)
				.sorted(comparing(Member::getHandicap)).toList();
		// 5.Tier les « Members» jouant dans « TeamA » en fonction de leur nom (lastName) ;
		 List<Member> teamAMembersSortedByName = members.stream()
	                .filter(m -> m.getTeam().equals("TeamA"))
	                .sorted(comparing(Member::getLastName)).toList();
		 
	        List<Member.Type> teamCMemberTypes = members.stream()
	                .filter(m -> m.getTeam().equals("TeamC"))
	                .map(Member::getType)
	                .toList();


	        // 7. Sélectionner les noms (LastName) des « Members» de type « Senior » jouant dans « TeamB »
	        List<String> seniorMembersInTeamB = members.stream()
	                .filter(m -> m.getType() == Member.Type.Senior && m.getTeam().equals("TeamB"))
	                .map(Member::getLastName)
	                .toList();

	        // 8. Renvoyer le maximum des handicaps
	        OptionalInt maxHandicap = members.stream().mapToInt(Member::getHandicap).max();



	        // 9. Renvoyer le minimum des handicaps
	        OptionalInt minHandicap = members.stream().mapToInt(Member::getHandicap).min();

	        // 10. Y'a t-il un membre jouant dans l'équipe TeamC et ayant un handicap >20
	        boolean hasMemberInTeamCWithHighHandicap = members.stream()
	                .anyMatch(m -> m.getTeam().equals("TeamC") && m.getHandicap() > 20);

		
		
	}

}

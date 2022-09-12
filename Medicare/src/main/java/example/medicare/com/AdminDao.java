package example.medicare.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import example.medicare.com.Admin;
import example.medicare.com.AdminRepo;

@Service
public class AdminDao {
	@Autowired
	public AdminRepo arepo;
	
	public Admin addAdmin(Admin a) {
		return arepo.save(a);
	}
	public Admin adminLogin(Admin a) {
		Admin anew=arepo.findByMail(a.getAdminEmail());
		if(anew.getPassword().equals(a.getPassword())) {
			return anew;
		}
		return null;
	}

}
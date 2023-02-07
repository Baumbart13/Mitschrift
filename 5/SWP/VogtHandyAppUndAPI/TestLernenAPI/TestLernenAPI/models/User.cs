using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace TestLernenAPI.models
{
    public class User
    {
        public User(int userId, string firstname, string lastname, DateTime age)
        {
            UserId = userId;
            this.firstname = firstname;
            this.lastname = lastname;
            this.age = age;
        }
        

        public int UserId { get; set; }
        public String firstname { get; set; }
        public User()
        {

        }
        public String lastname { get; set; }
        public DateTime age { get; set; }
    }
}

using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using TestLernenAPI.models;

namespace TestLernenAPI.haltsMaulSebi
{
    [Route("api/[controller]")]
    [ApiController]
    public class UserController : ControllerBase
    {
        ServerDBContext _context = new ServerDBContext();

        [HttpGet]
        [Route("/get/{id}")]
        public List<User> getUser(int id)
        {
            List<User> users = this._context.User.ToList();

            return users.Where(u => u.UserId.Equals(id)).ToList();
        }

        [HttpPost]
        [Route("/post")]
        public async void postUser([FromBody] User us)
        {
            await _context.User.AddAsync(us);
            _context.SaveChanges();

        }
    }
}

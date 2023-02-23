package com.nagihan.bolukbas.staj.mapper;

import java.util.ArrayList;
import java.util.List;

import com.nagihan.bolukbas.staj.dto.ActorDto;

public class ActorEntityDto<Actor> {
	public ActorDto convert1(Actor actor) {
		ActorDto actordto = new ActorDto();

		actordto.setLastName(actordto.getName());
		actordto.setLastName(actordto.getName());
		return actordto;

	}

	public <Actor> List<ActorDto> convert(List<Actor> actors) {
		List<ActorDto> returnList = new ArrayList<>();
		for (Actor actor : actors) {
			returnList.add(convert1(actor));
		}

		return returnList;

	}

	private ActorDto convert(Actor actor) {
		// TODO Auto-generated method stub
		return null;
	}
	private ActorDto convert11(Actor actor) {
		// TODO Auto-generated method stub
		return null;
	}


}

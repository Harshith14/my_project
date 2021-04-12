package mapper;

import com.organization.entity.TourismEntity;
import com.organization.model.TourismModel;

public class TourismMapper {

  public static TourismModel mapToModel(TourismEntity tourismEntity){
      TourismModel tourismModel= new TourismModel();
      tourismModel.setTourismId(tourismEntity.getTourismId());
      tourismModel.setNameOfTourism(tourismEntity.getNameOfTourism());
      tourismModel.setNumberOfMembers(tourismEntity.getNumberOfMembers());
      tourismModel.setCountry(tourismEntity.getCountry());
      tourismModel.setNoOfPlaces(tourismEntity.getNoOfPlaces());
      tourismModel.setTotalPrize(tourismEntity.getTotalPrize());
    return tourismModel;
}

public static TourismEntity mapToEntity(TourismModel tourismModel){
    TourismEntity tourismEntity= new TourismEntity();
    tourismEntity.setTourismId(tourismModel.getTourismId());
    tourismEntity.setNameOfTourism(tourismModel.getNameOfTourism());
    tourismEntity.setNumberOfMembers(tourismModel.getNumberOfMembers());
    tourismEntity.setCountry(tourismModel.getCountry());
    tourismEntity.setNoOfPlaces(tourismModel.getNoOfPlaces());
    tourismEntity.setTotalPrize(tourismModel.getTotalPrize());
    return tourismEntity;
}
}

